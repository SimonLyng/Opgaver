public class Driver {
            private String Name;
            private int Age;

            public Driver(String name, int age) {
                Name = name;
                Age = age;

            }

                @Override
                public String toString () {
                    return " is driven by "+Name;


                }
}



