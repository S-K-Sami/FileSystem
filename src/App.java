public class App {
    public static void main(String[] args) throws Exception {
        String curDir = System.getProperty("user.dir");
        String mode;
        try {
            mode = args[0];
        } catch (Exception e) {
            mode = "";
        }
        switch (mode) {
            case "tree":
                Sami003.tree(curDir);
                break;
            // TODO: Add cases and implement your methods in seprate class following the classname formate: Name<3 digit Reg>
        
            default:
                Sami003.explore(curDir);
                break;
        }
    }
}
