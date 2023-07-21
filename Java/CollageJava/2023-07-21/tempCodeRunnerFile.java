FileReader fr = new FileReader("demo.txt");
        char demo = (char)fr.read();
        while (demo != -1) {
            System.out.println(demo);
            demo = (char)fr.read();
        }