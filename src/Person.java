public class Person implements Comparable<Person>{
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
      if (namberwords()>o.namberwords()){
           return -1;
       }else if (namberwords()<o.namberwords()){
        return 1;
       }else {
             if (age < o.age) {
                return 1;
            } else if (age > o.age) {
                return -1;
            } else {
                return 0;
            }

        }
    }


    public int namberwords (){
        int count =0;
        if(surName.length() != 0){
            count++;
            for (int i = 0; i < surName.length(); i++) {
                if(surName.charAt(i) == ' '|| surName.charAt(i) == '-'){
                    count++;
                }
            }
        } return count;
    }

    @Override
    public String toString() {
        return  name + " " + surName +  " " + age ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
