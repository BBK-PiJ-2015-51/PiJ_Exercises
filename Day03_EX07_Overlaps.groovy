
class Point {
	double x
	double y
}


class Rectangle {
	Point upLeft
	Point downRight
}

boolean xAxisInsideRectangle1 
boolean yAxisInsideRectangle1 
boolean xAxisInsideRectangle2 
boolean yAxisInsideRectangle2 

Point p1 = new Point()
p1.x = 10
p1.y = 6

Point p2 = new Point()
p2.x = 10
p2.y = 3

Point p3 = new Point()
p3.x = 8
p3.y = 7

Point p4 = new Point()
p4.x = 12
p4.y = 4

Point p5 = new Point()
p5.x = 9
p5.y = 4

Rectangle rectangle1 = new Rectangle()
rectangle1.upLeft = p1
rectangle1.downRight = p2

Rectangle rectangle2 = new Rectangle()
rectangle2.upLeft = p3
rectangle2.downRight = p4




if (p5.x >= rectangle1.upLeft.x && p5.x <= rectangle1.downRight.x) {
	xAxisInsideRectangle1 = true
}

if (p5.y >= rectangle1.downRight.y && p5.y <= rectangle1.upLeft.y) {
	yAxisInsideRectangle1 = true
}

if (p5.x >= rectangle2.upLeft.x && p5.x <= rectangle2.downRight.x) {
	xAxisInsideRectangle2 = true
}

if (p5.y >= rectangle2.downRight.y && p5.y <= rectangle2.upLeft.y) {
	yAxisInsideRectangle2 = true
}


if (yAxisInsideRectangle1 && xAxisInsideRectangle1) {

	println "The point is inside Rectangle 1"
} else {
	println "The point is outside Rectangle 1"
}

if (yAxisInsideRectangle2 && xAxisInsideRectangle2) {

	println "The point is inside Rectangle 2"
} else {
	println "The point is outside Rectangle 2"
}




