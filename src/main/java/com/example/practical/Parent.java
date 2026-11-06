package com.example.practical;

public class Parent
{
	public class OverrideExample {
	    
	        void show() {
	            System.out.println("Parent version");
	        }
	    }

	    static class Child extends Parent {
	        @Override
	        void show() {
	            System.out.println("Child version");
	        }
	    }

	    public static void main(String[] args) {
	        Parent obj = new Child();
	        obj.show();
	    }

		void show() {
		
			
		}
	}
	
	

