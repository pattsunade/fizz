apublic class FizzBuzz {
    
    public void  fizzBuzz(int number) {
        if(number%3 == 0){
            System.out.println("Buzz " + number);
        } else if(number%5 == 0){
            System.out.println("Fizz" + number);
        } else if(number%3 == 0 && number%5 == 0){
            System.out.println("BuzzFizz" + number);
        }
        
    } 
}

