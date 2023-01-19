public class TreeView {
    public static void view (Persona root, int num) {
        String line = "_".repeat(num);
        System.out.println(line + root.FullName);
        for (Persona a : root.getListName()) {
            view(a, num + 1);


        }

    }
}