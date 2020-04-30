
def a = 100

int b = 11

println "value of a:" + a

a = 200

println "value of a:" + a

def arrayNumber = [1,2,3,4,5,6,7,8,9,10]

println "First array arrayNumber:" + arrayNumber

def arrayString = ["Phani", 'Teja', 'Guru']

println "Second array arrayString: " + arrayString

def arrayString2 = [1, 'Phani', 2, 'Teja', 3, 'Guru', 5, 6, 7, 8] // this will not work

println "Third mixed array arrayString: " + arrayString

def arrayString3 = ['1', 'Phani', '2', 'Teja', '3', 'Guru', '5'] // this will work

println "Fourth array arrayString: " + arrayString
