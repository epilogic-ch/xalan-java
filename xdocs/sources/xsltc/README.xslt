NAME
	xslt - Sun XSLT runtime processor. 


SYNOPSIS
	xslt [-j <jarfile>] {-u <document_url> | <document>} <class> 
             [<name1>=<value1> ...]


DESCRIPTION
	The Sun XSLT runtime processor is a Java-based tool for 
	transforming XML document files using a translet (compiled 
	stylesheet). 

	The XSLT processor can be run on any platform including UNIX,
	Windows, NT, Mac that supports Java, including a Palm Pilot
	with J2ME CLDC (Java 2 Micro Edition, Connected Limited Device
	Configuration).

OPTIONS

	The following options are supported:

	-j <jarfile>
		gets the translet <class> from the specified <jarfile>
		instead of from the user's CLASSPATH.	

	-u
		Specifies that the XML <document> location will be a URI
		such as 'http://myserver/hamlet.xml'.		


OPERANDS

	The following operands are supported:

	<document>     		An XML document to be processed. 
	<document_url>     	An XML document to be processed, specified
				as a URL (See -u option above). 

	<class>			The translet that will do the processing.
				The translet may optionally take a set of 
				global parameters specified as name-value 
				pairs. A name-value pair uses the format
				<name>=<value>.

EXAMPLES
	Example 1:  Processing an XML document.

	example%  xslt hamlet.xml hamlet 

	where the current working directory contains an XML document
	'hamlet.xml' to be processed by the translet class 'hamlet'.
	The translet would have been created initially using
	xsltc to compile a XSLT stylesheet named 'hamlet.xsl'. 

	Example 2:  Loading translet from a jar file. 

	example%  xslt -j hamlet.jar hamlet.xml hamlet

	In this case the translet class 'hamlet' is loaded from the
	specified jar file, 'hamlet.jar' instead of from the user's
	CLASSPATH.

	Example 3: If the translet defined global parameters, then 
	these can be passed on the command line to the runtime processor
	as a space separated list of name-value pairs using the format
	<name>=<value>. For example,

	example%  xslt hamlet.xml hamlet speaker=HAMLET 'scene=SCENE IV'

	Notice that the second name-value pair had to be quoted due to 
	the intervening space in the value "SCENE IV".

	example% xslt -u http://zarya.east/test.xml hamlet

	where the xml document 'test.xml' can be specified as a URL.

FILES
	file.xml		input XML document to be processed. 
	file.class		byte code file.
	file.jar		java archive file.
	
SEE ALSO
	xsltc, jar.

BUGS
	Refer to the top-level README included in this release.

AUTHORS
	Jacek Ambroziak,                       jacek.ambroziak@East.Sun.COM
	Santiago Pericas-Geertsen,    santiago.pericasgeertsen@East.Sun.COM 

	Contributors:

	Morten Jorgensen		   morten.jorgensen@Ireland.Sun.COM
	G. Todd Miller,                            todd.miller@East.Sun.COM
