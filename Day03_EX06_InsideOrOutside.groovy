
class Point {
	double x
	double y
}


class Rectangle {
	Point upLeft
	Point downRight
}

boolean xAxisInside = false
boolean yAxisInside = false


Rectangle rectangle1 = new Rectangle()

Point p1 = new Point()
p1.x = 5
p1.y = 5

Point p2 = new Point()
p2.x = 9
p2.y = 3

Point p3 = new Point()
p3.x = 10
p3.y = 3

rectangle1.upLeft = p1
rectangle1.downRight = p2

if (p3.x >= rectangle1.upLeft.x && p3.x <= rectangle1.downRight.x) {

	xAxisInside = true
}

if (p3.y >= rectangle1.downRight.y && p3.y <= rectangle1.upLeft.y) {

	yAxisInside = true
}

if (yAxisInside && xAxisInside) {

	println "yes the point is inside"
} else {
	println "no the point is outside"
}


