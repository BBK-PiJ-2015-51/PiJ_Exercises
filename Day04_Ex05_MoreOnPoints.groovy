import java.lang.Math


class Point {
	double x
	double y


double distanceTo(Point p) {
	double firstTerm1to2 = Math.pow(this.x - p.x,2)
	double secondTerm1to2 = Math.pow(this.y - p.y,2)
	int distance1to2 = Math.sqrt(firstTerm1to2+secondTerm1to2)
	return distance1to2
}

double distanceToOrigin() {
	Point origin = new Point()
	origin.x = 0
	origin.y = 0
	return distanceTo(origin)
}

void moveTo(double x, double y) {
	this.x = x
	this.y = y
}

void moveTo(Point p) {
	this.x = p.x
	this.y = p.y
}

Point clone() {

	Point p = new Point()
	p.x = this.x
	p.y = this.y
	return  p
}

Point opposite() {
	Point p = new Point()
	p.x = this.x * -1
	p.y = this.y * -1
	return  p
}


}

Point one = new Point()
one.x = 8
one.y = 1

Point two = new Point()
two.x = 13
two.y = 9

//println one.distanceTo(two)
//println one.distanceToOrigin()

println one.x
println one.y
one.moveTo(two)
println one.x
println one.y

Point three = one.clone()
println three.x
println three.y

Point four = one.opposite()
println four.x
println four.y








