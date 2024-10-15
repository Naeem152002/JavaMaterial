class Shape 
{

float length,breadth;

void areaCalculate()
{}

void perimeterCalculate()
{}

Shape()
{}

Shape(float length,float breadth)
{
this.length=length;
this.breadth=breadth;
}

void display()
{
System.out.println("length = "+length);
System.out.println("breadth = "+breadth);
 }
}


class Rectangle extends Shape
{

Rectangle()
{
super(11.5f,22.5f);
}

void areaCalculate()
{
super.display();
double area_rect=length*breadth;
System.out.println("area of rectangle = " + area_rect);
}

void perimeterCalculate()
{
double perimeter_rect=2*(length+breadth );
System.out.println("perimeter of rectangle = " +perimeter_rect);
}
}



class Cuboid extends Shape
{

float height=22.5f;

/*
Cuboid(float h)
{
super(11f,22f);
height=h;
}
*/
Cuboid()
{
super(11f,22f);
}
void areaCalculate()
{
super.display();
System.out.println("height of cuboid = "+height);
double area_cuboid=2*(length*breadth+breadth*height+length*height);
System.out.println("area of cuboid = " +area_cuboid);
}

void perimeterCalculate()
{
double perimeter_cuboid = 2*(length+breadth)*height;
System.out.println("Perimeter of cuboid = "+perimeter_cuboid);
} 

} 



 class Test
{
public static void main(String s[])
{
 
// Shape c=new Rectangle();
 Shape c=new Cuboid();
 c.areaCalculate();
 c.perimeterCalculate(); 
  

}
}