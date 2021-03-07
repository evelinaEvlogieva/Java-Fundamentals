import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new HashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        Map<String, Integer> junk = new TreeMap<>();

        int shardsValue = 0;
        int fragmentsValue = 0;
        int motesValue = 0;

        boolean isMaterialEnough = false;

        while (!isMaterialEnough) {
            String[] tokens = scanner.nextLine().split(" ");
            for (int i = 0; i < tokens.length; i += 2) {
                int value = Integer.parseInt(tokens[i]);
                String material = tokens[i + 1].toLowerCase();

                if (keyMaterials.containsKey(material)) {
                    int newValue = keyMaterials.get(material) + value;
                    keyMaterials.put(material, newValue);

                    if ("shards".equals(material)) {
                        shardsValue += value;
                        isMaterialEnough = shardsValue >= 250;
                    } else if ("fragments".equals(material)) {
                        fragmentsValue += value;
                        isMaterialEnough = fragmentsValue >= 250;
                    } else if ("motes".equals(material)) {
                        motesValue += value;
                        isMaterialEnough = motesValue >= 250;
                    }

                    if (isMaterialEnough) {
                        break;
                    }

                } else {
                    junk.putIfAbsent(material, 0);
                    int newValue = junk.get(material) + value;
                    junk.put(material, newValue);
                }
            }
        }
        String winningItem = "";

        if (shardsValue >= 250) {
            winningItem = "Shadowmourne";
            shardsValue -= 250;
            keyMaterials.put("shards", shardsValue);
        } else if (fragmentsValue >= 250) {
            winningItem = "Valanyr";
            fragmentsValue -= 250;
            keyMaterials.put("fragments", fragmentsValue);
        } else if (motesValue >= 250) {
            winningItem = "Dragonwrath";
            motesValue -= 250;
            keyMaterials.put("motes", motesValue);

        }

        System.out.printf("%s obtained!%n", winningItem);

        keyMaterials.entrySet().stream().sorted((f, s) -> {
            int result = s.getValue().compareTo(f.getValue());

            if (result == 0) {
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        })
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
                });

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
