
class Point {
	double x
	double y
}


class Rectangle {
	Point upLeft
	Point downRight
}

Rectangle rectangle1 = new Rectangle()

Point p1 = new Point()
p1.x = 5
p1.y = 5

Point p2 = new Point()
p2.x = 9
p2.y = 3

rectangle1.upLeft = p1
rectangle1.downRight = p2

double area = (rectangle1.downRight.x - rectangle1.upLeft.x) * (rectangle1.upLeft.y - rectangle1.downRight.y)
double perimeter = ((rectangle1.downRight.x - rectangle1.upLeft.x) *  2) + ((rectangle1.upLeft.y - rectangle1.downRight.y)*2)

println "Area: " + area
println "Perimeter: " + perimeter