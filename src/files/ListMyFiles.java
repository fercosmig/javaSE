/**
 * 
 */
package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Fernando Costa Migliorini
 * @email fercosmig@gmail.com
 * @since Dec 23, 2019
 * @file files.ListMyFiles.java
 */
public class ListMyFiles {
	private static final Logger LOGGER = LogManager.getLogger(ListMyFiles.class.getName());

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String diretorio = "/home/fercosmig/Pictures/wallpapers/";
		BasicFileAttributes attrs;
		File file = new File(diretorio);
		File files[] = file.listFiles();
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		try {
			for (File f : files) {
				attrs = Files.readAttributes(f.toPath(), BasicFileAttributes.class);
				FileTime time = attrs.creationTime();

				String name = f.getName();
				String createDate = sdf.format(new Date(time.toMillis()));

				System.out.println(name + " - " + createDate);
			}
		} catch (IOException e) {
			LOGGER.error(e);
		}

	}

}
