package ch04.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class JUnit5TempDirTester {
	@TempDir
	Path tempDir;
	private static Path createdFile;

	@Test
	public void testTemporaryFolder() throws IOException {
		assertTrue(Files.isDirectory(tempDir));
		createdFile = Files.createFile(tempDir.resolve("createdFile.txt"));
		assertTrue(createdFile.toFile().exists());
	}

	@AfterAll
	public static void afterAll() {
		assertFalse(createdFile.toFile().exists());
	}
}
