package HW200624;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class DirectoryCopy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к существующей папке:");
        String sourceDir = scanner.nextLine();

        System.out.println("Введите имя новой папки:");
        String destinationDir = scanner.nextLine();

        try {
            copyDirectory(sourceDir, destinationDir);
            System.out.println("Папка успешно скопирована.");
        } catch (IOException e) {
            System.err.println("Ошибка при копировании папки: " + e.getMessage());
        }
    }

    public static void copyDirectory(String sourceDir, String destinationDir) throws IOException {
        Path sourcePath = Paths.get(sourceDir);
        Path destinationPath = Paths.get(destinationDir);

        Files.walkFileTree(sourcePath, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                Path targetPath = destinationPath.resolve(sourcePath.relativize(dir));
                if (!Files.exists(targetPath)) {
                    Files.createDirectory(targetPath);
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.copy(file, destinationPath.resolve(sourcePath.relativize(file)), StandardCopyOption.REPLACE_EXISTING);
                return FileVisitResult.CONTINUE;
            }
        });
    }

}
