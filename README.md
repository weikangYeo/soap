# soap
a demo for soap host and client (JDK12)

the lib required for JDK 12 is different from JDK 8 project, this project is poc demo base on JDK 12



#SOAP-Host
a demo to show how to generate WSDL for client to consume
1. write xsd file
2. add maven plugin script (beware of the jaxb version), and run "mvn compile"
3. after file gen, register the generated file as endpoint and expose it to wsdl

#SOAP-Client
1. download wsdl generated from Host
2. write a service that extend WebServiceGatewaySupport, this file will act as a template to do remote call
