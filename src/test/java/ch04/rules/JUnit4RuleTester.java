package ch04.rules;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class JUnit4RuleTester {
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@Test
	public void checkCreation() throws IOException {
		File createdFolder = folder.newFolder("aTempFolder");
		File createdFile = folder.newFile("aTempFile");
		assertTrue(createdFolder.exists());
		assertTrue(createdFile.exists());
	}
}
