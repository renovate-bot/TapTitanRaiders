package Utilities;

import java.net.URL;
import java.nio.file.Paths;

public class Utils {
    /**
     * @param relativeFilePath full file-path relative to the project resources directory:
     *                         /unified-agent/unified-agent-main/src/test/resources/
     * @return String containing the full path in the system in case found, or null otherwise
     */
    public static String getFullPathFromResources(String relativeFilePath) {
        String result = null;

        ClassLoader classLoader = Utils.class.getClassLoader();
        // full path
        URL resourceURL = classLoader.getResource(relativeFilePath);

        if (resourceURL != null) {
            String fileName = resourceURL.getFile().replaceAll("%5c", "/");

            if (!fileName.isEmpty()) {
                if (isWindows()) {
                    fileName = fileName.substring(1); // remove leading slash '/'
                    fileName = fileName.replace("%20", " ");
                }
                result = Paths.get(fileName).toString();
            }
        }

        return result;
    }
    public static boolean isWindows() {
        return System.getProperty(Constants.OS_NAME).toLowerCase().contains(Constants.WIN);
    }
}
