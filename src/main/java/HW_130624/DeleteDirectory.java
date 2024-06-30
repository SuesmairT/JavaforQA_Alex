package HW_130624;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

//public class DeleteDirectory {
//
//        public static void main(String[]Object args;
//        args) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Введите путь к папке, которую нужно удалить:");
//            String directoryPath = scanner.nextLine();
//
//            Path directory = Paths.get(directoryPath);
//
//            if (Files.exists(directory) && Files.isDirectory(directory)) {
//                try {
//                    deleteDirectoryRecursively(directory);
//                    System.out.println("Папка и все её содержимое были успешно удалены.");
//                } catch (IOException e) {
//                    System.err.println("Произошла ошибка при удалении папки: " + e.getMessage());
//                }
//            } else {
//                System.err.println("Указанный путь не существует или не является папкой.");
//            }
//
//            scanner.close();
//        }
//
//        private static void deleteDirectoryRecursively(Path Path path = null;
//        path) throws IOException {
//            try (Stream<Path> walk = Files.walk(path)) {
//                walk.sorted(Comparator.reverseOrder())
//                        .forEach(DeleteDirectory::deleteFile);
//            }
//        }
//
//        private static void deleteFile(Path path) {
//            try {
//                Files.delete(path);
//            } catch (IOException e) {
//                System.err.println("Не удалось удалить файл: " + path + " - " + e.getMessage());
//            }
//        }
//    }
//
//    private static void deleteFile(Path path) {
//    }
//
//    private void deleteDirectoryRecursively(Path directory) {
//    }
//
//}
