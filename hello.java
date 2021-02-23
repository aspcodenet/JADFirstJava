class Application
{
    public static void main(String[] args) {
        System.out.println("Vad heter du?");
        String namn = System.console().readLine();

        System.out.println("Hur gammal är du?");
        int age = Integer.parseInt(System.console().readLine());

        System.out.println("Hejsan " + namn);
        if(age > 48)            
        {
            System.out.println("Gamling");
        }
        else
        {
            System.out.println("Hej ungdom");
        }

        for(int i = 0; i < age; i++)
        {
            System.out.println("Varv " + i);
        }

    }
}