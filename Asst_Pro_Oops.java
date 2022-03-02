//Class And Object

class Lamp {
  boolean isOn;
  void turnOn() {
    isOn = true;
    System.out.println("Light on? " + isOn);
  }
  void turnOff() {
    isOn = false;
    System.out.println("Light on? " + isOn);
  }
}
class OOPS {
  public static void main(String[] args) {
    Lamp led = new Lamp();
    Lamp halogen = new Lamp();
    led.turnOn();
    halogen.turnOff();
  }
}

//Polymorphism

class Polygon {
	public void render() {
	   System.out.println("Rendering Polygon...");
	}
}
class Square extends Polygon {
	public void render() {
	   System.out.println("Rendering Square...");
	}
}
class Circle extends Polygon {
	public void render() {
	   System.out.println("Rendering Circle...");
	}
}
class OopsPoly {
	public static void main(String[] args) {
	   Square s1 = new Square();
	   s1.render();
	   Circle c1 = new Circle();
	   c1.render();
	}
}

//Inheritance

class Animal {
	String name;
	public void eat() {
		System.out.println("I can eat");
	}
}
class Dog extends Animal {
	public void display() {
		System.out.println("My name is " + name);
	}
}
class OopsInherit {
	public static void main(String[] args) {
		Dog labrador = new Dog();
		labrador.name = "Leo";
		labrador.display();
		labrador.eat();
	}
}

//Encapsulation

class Area {
	int length;
	int breadth;
	Area(int length, int breadth) {
	   this.length = length;
	   this.breadth = breadth;
	}
	public void getArea() {
	   int area = length * breadth;
	   System.out.println("Area: " + area);
	}
}
class OopsEncap {
	public static void main(String[] args) {
	   Area rectangle = new Area(5, 6);
	   rectangle.getArea();
	}
}

//Abstraction

abstract class Pet {
	abstract void makeSound();
	public void eat() {
	   System.out.println("I can eat.");
	}
}
class Cat extends Animal {
	public void makeSound() {
	   System.out.println("Mew Mew");
	}
}
class OopsAbstract {
	public static void main(String[] args) {
	   Cat c = new Cat();
	   c.makeSound();
	   c.eat();
	}
}