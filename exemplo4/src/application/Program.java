package application;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		List<Post> posts = new ArrayList<>();

		System.out.print("Number of posts: ");
		int numOfPosts = keyboard.nextInt();
		keyboard.nextLine();

		for (int i = 1; i <= numOfPosts; i++) {
			System.out.print("Title: ");
			String title = keyboard.nextLine();

			System.out.print("Likes: ");
			int likes = keyboard.nextInt();
			keyboard.nextLine();

			Date moment = new Date(System.currentTimeMillis());

			System.out.print("Content: ");
			String content = keyboard.nextLine();

			Post p = new Post(moment, title, content, likes);
			posts.add(p);

			System.out.print("Number of comments: ");
			int numOfComments = keyboard.nextInt();
			keyboard.nextLine();

			for (int y = 1; y <= numOfComments; y++) {
				System.out.print("Enter comment: ");
				String text = keyboard.nextLine();
				p.addComment(new Comment(text));
			}

			System.out.println();
			
		}

		for (Post aux : posts) {
			System.out.println(aux.getTitle());
			System.out.println(aux.getLikes() + " Likes - " + sdf.format(aux.getMoment()));
			System.out.println(aux.getContent());
			System.out.println("Comments: ");

			for (Comment c : aux.getComment()) {
				System.out.println(c.getText());
			}

			System.out.println();

		}

		keyboard.close();

	}

}
