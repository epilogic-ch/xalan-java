/*
 * The Apache Software License, Version 1.1  
 *
 *
 * Copyright (c) 1999 The Apache Software Foundation.  All rights 
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer. 
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:  
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "Xalan" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written 
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 1999, Lotus
 * Development Corporation., http://www.lotus.com.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.xalan.xpath;


import org.w3c.dom.*;

import org.apache.xpath.XPathContext;
/**
 * <meta name="usage" content="general"/>
 * This class represents an XPath string object, and is capable of 
 * converting the string to other types, such as a number.
 */
public class XString extends XObject
{
  
  org.apache.xpath.objects.XString m_xstring;
  
  /**
   * Construct a XString object.
   */
  public XString(String val)
  {
    super(val);
    m_xstring = new org.apache.xpath.objects.XString(val);
  }
  
   /**
   * Tell that this is a CLASS_STRING.
   */
  public int getType()
  {
    return m_xstring.getType();
  }
  
  /**
   * Given a request type, return the equivalent string. 
   * For diagnostic purposes.
   */
  public String getTypeString() // PR:DMAN4MBJ4D Submitted by:<garyp@firstech.com> change to protected
  {
    return m_xstring.getTypeString();
  }
  
  /**
   * Cast a string to a number.
   */
  public static double castToNum(String s)
  {  
    return org.apache.xpath.objects.XString.castToNum(s);    
  }
  
  /**
   * Cast result object to a number.
   */
  public double num()
  {
    return m_xstring.num();
  }

  /**
   * Cast result object to a boolean.
   */
  public boolean bool()
  {
    return m_xstring.bool();
  }

  /**
   * Cast result object to a string.
   */
  public String str()
  {
    return m_xstring.str();
  }
  
  /**
   * Cast result object to a result tree fragment.
   */
  public DocumentFragment rtree(XPathSupport support)
  {    
    return m_xstring.rtree((XPathContext)support);
  }
  
  
  /**
   * Cast result object to a result tree fragment.
   *
   * @param support Xpath context to use for the conversion 
   *
   * @return A document fragment with this string as a child node
   */
  public DocumentFragment rtree(XPathContext support)
  {      
    return m_xstring.rtree(support);
  }
  
  /**
   * Tell if two objects are functionally equal.
   */
  public boolean equals(XObject obj2)
    throws org.xml.sax.SAXException, javax.xml.transform.TransformerException
  {
    return m_xstring.equals(obj2);
  }

  
}
