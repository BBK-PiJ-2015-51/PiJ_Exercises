
class Point {
	double x
	double y
}

import java.lang.Math

Point point1 = new Point()
point1.x = 5
point1.y = 5

Point point2 = new Point()
point2.x = 10
point2.y = 10

Point point3 = new Point()
point2.x = 25
point2.y = 25

//1 to 2
firstTerm1to2 = Math.pow(point1.x - point2.x,2)
secondTerm1to2 = Math.pow(point1.y - point2.y,2)

int distance1to2 = Math.sqrt(firstTerm1to2+secondTerm1to2)

//1 to 3
firstTerm1to3 = Math.pow(point1.x - point3.x,2)
secondTerm1to3 = Math.pow(point1.y - point3.y,2)

int distance1to3 = Math.sqrt(firstTerm1to3+secondTerm1to3)

//2 to 3
firstTerm2to3 = Math.pow(point2.x - point3.x,2)
secondTerm2to3 = Math.pow(point2.y - point3.y,2)

int distance2to3 = Math.sqrt(firstTerm2to3+secondTerm2to3)

println "distance 1 to 2 " + distance1to2
println "distance 1 to 3 " + distance1to3
println "distance 2 to 3 " + distance2to3

if (distance1to2 < distance1to3 && distance1to2 < distance2to3) {

		println "distance 1 to 2 is shortest"

	} 

if (distance1to3 < distance1to2 && distance1to3 < distance2to3) {

		println "distance 1 to 3 is shortest"

	} 

if (distance2to3 < distance1to2 && distance2to3 < distance1to3) {

		println "distance 2 to 3 is shortest"

	} 

