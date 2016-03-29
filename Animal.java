
interface Animal extends LivingThing{
    double weight = 4.5;
    int legs = 4;
    void eat();
    void travel();  
}
interface LivingThing {

    void live();
}
interface Bird {
    int swing = 2;
    void fly();
}