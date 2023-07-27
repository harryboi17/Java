package Assignment;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) throws IOException {
//        String door_fitting[] = {"Room Number 1", "Secret room"};
//        String codes[] = {"910", "811"};
        String door_fitting[] = {"Room 666", "Don't enter"};
        String codes[] = {"313", "800"};
//        String door_fitting[] = {"Portal 1", "Portal 2", "Portal 3"};
//        String codes[] = {"501"};
//        String door_fitting[] = {"Door to nowhere", "Door to nowhere 2"};
//        String codes[] = {"1203", "1203"};

            int n = door_fitting.length;
            Map<String, Integer> mp = new HashMap<>();

            for (int i = 0; i < n; i++) {
                mp.put(codes[i], mp.getOrDefault(codes[i], 0) + 1);
            }

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < n; i++) {
                int m = door_fitting[i].length();
                int l = 0;
                int d = 0;
                boolean r = false;

                for (int j = 0; j < m; j++) {
                    if (Character.isLowerCase(door_fitting[i].charAt(j))) {
                        l++;
                    }
                    if (Character.isDigit(door_fitting[i].charAt(j))) {
                        d++;
                    }
                }

                for (int j = 0; j < n - 4; j++) {
                    String data = door_fitting[i].substring(j, j + 4).toLowerCase();
                    if (data.equals("room")) {
                        r = true;
                        break;
                    }
                }

                String x = l + (r ? "1" : "0") + d;
                if (mp.getOrDefault(x, 0) == 0) {
                    continue;
                }

                ans.append(door_fitting[i]).append("-").append(l).append((r ? "1" : "0")).append(d).append(";");
            }

            System.out.println(ans);
    }
}
