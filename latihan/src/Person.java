    class Person {
        String name;
        String address;
        String city;
        final String country = "Indonesia";

        Person(String paramname, String paramaddress){
            name = paramname;
            address = paramaddress;
        }

        void sayhello(String paramname) {
            System.out.println("helo" + paramname + ", My name is" + name);
        }

    }
