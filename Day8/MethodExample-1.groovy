/*
1. parameters and return the output

<dataType> == int/long/double/float/short/char/String/arrays/boolean

<dataType> <methodName> (parameter1, parameter2... parameterN) {

	login goes here
	
	
	return <variableName>/<value>
	
}

int addition(int a, int b){

	int c = a + b
	
	return c

}

*/

int addition(int a, int b){

	int c = a + b
	
	return c

}

int addition2(int a, int b){

	return (a + b)

}

int c = addition(100,200)
println "Addition of two numbers 100 & 200 is: " + c

println "Addition of two numbers 132 & 256 is: " +  addition2(132,256)


String strConcat(String a, String b){

	return (a+' '+b)

}

String str1 = "DevOps"

String str2 = "Groovy Script"

println "Concatination of two strings: " + strConcat(str1,str2)

