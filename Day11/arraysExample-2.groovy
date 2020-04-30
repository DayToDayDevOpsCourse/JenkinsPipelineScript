

def arrayNumber = [34,13,22,43,64,25,68,77,8,9,10,45]

println "The length of the array is: " + arrayNumber.size()

println "First elment: " + arrayNumber[0]


println "Fourth indexed elment: " + arrayNumber[3]

println "Seventh elment: " + arrayNumber[6]

println "Final/Last elment: " + arrayNumber[arrayNumber.size()-1]

/*
println "First elment: " + arrayNumber[1]
println "First elment: " + arrayNumber[2]
*/

for(int i = 0;i<=arrayNumber.size()-1;i++){

	//println i + "- index: elements from the array: " + arrayNumber[i]
	
	if(arrayNumber[i]%2 == 0){
		println arrayNumber[i] + "- this is an even number"
	}else{
		println arrayNumber[i] + "- this is an odd number"
	}

}


