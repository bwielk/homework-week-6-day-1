class Bus{
  private int number;
  private Person[] passengers;
  private String destination;

  public Bus(int number, String destination){
    this.number = number;
    this.destination = destination;
    this.passengers = new Person[20];
  }

  public int getNumber(){
    return this.number;
  }

  public String getDestination(){
    return this.destination;
  }

  public int passCount(){
    int counter = 0;
    for(Person person : passengers){
      if(person != null){
        counter += 1;
      }
    }
    return counter;
  }

  public boolean theBusIsFull(){
    return passCount() == passengers.length;//checks if the buss is full
  }

  public void getIn(Person person){
    if(theBusIsFull()) return;
    int nextPass = passCount();
    passengers[nextPass] = person;
  }

  public void getOff(){
    for(int i=0;i<passengers.length; i+=1){
      passengers[i] = null;
    }
  }
}
