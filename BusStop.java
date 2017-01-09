class BusStop{
  private String name;
  private Person[] queue;

  public BusStop(String name){
    this.name = name;
    this.queue = new Person[10];
  }

  public String getName(){
    return this.name;
  }

  public int personCount(){
    int counter = 0;
    for(Person person : queue){
      if(person != null){
        counter +=1;
      }
    }
    return counter;
  }

  public boolean theBusStopIsFull(){
    return personCount() == queue.length;
  }

  public void add(Person person){
    if (theBusStopIsFull()) return;
    int nextPerson = personCount();
    queue[nextPerson] = person;
  }
}