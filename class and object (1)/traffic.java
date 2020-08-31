package com.assignment;


public enum traffic {
	   RED(1),  
        GREEN(2),  
        YELLOW(3);

        private final int duration; 

        traffic(int duration) { 
            this.duration = duration; 
        }  

        public int getDuration() { 
            return this.duration; 
        } 


        public static void main(String[] args) 
        {
            for(traffic light: traffic.values())
            {
               System.out.println("The traffic light value is: " +light);
               System.out.println("The duration of that trafic light value is: " + light.getDuration());
            }
        }   
    }


