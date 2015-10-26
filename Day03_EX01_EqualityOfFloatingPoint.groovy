double d1 = 1.255;
double d2 = d1 + 7 - 4 - 3;
if (d1 == d2) {
	
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}

println(d1);
println(d2);
println ("they are not equal because d2 is estimate");

println("Now this is the correction using equality");

double e1 = 1.255;
double e2 = e1 + 7 - 4 - 3;
if (Math.abs(d1 - d2) < 10E-6) {
	
	println("1.255 is equal to 1.255 plus 7 minus 7");
} else {
	println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}