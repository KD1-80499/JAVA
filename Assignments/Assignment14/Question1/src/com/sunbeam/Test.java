package com.sunbeam;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int choice;

		Candidate c = new Candidate();

		do {

			System.out.println("0.Exit");
			System.out.println("1.Add new candidate");
			System.out.println("2.Delete given candidate");
			System.out.println("3.Update given candidate");
			System.out.println("4.Get all candidates");
			System.out.println("5.Increment candidate vote");
			System.out.println("6.Get all candidates of given party");
			System.out.println("7.Get partywise vote count");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank you");
				break;

			case 1:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.println("Enter name:");
					String name = sc.next();
					System.out.println("Enter party:");
					String party = sc.next();
					System.out.println("Enter votes");
					int votes = sc.nextInt();
					c.setName(name);
					c.setParty(party);
					c.setVotes(votes);

					int cnt = dao.addnewCandidate(c);
					System.out.println("Rows inserted" + cnt);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;

			case 2:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.println("Enter candidate id to be deleted:");
					int id = sc.nextInt();
					int cnt = dao.deleteById(id);
					System.out.println("Candidates deleted:" + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.println("Enter candidate to be udpate");
					int id = sc.nextInt();
					System.out.println("Enter name:");
					String name = sc.next();
					System.out.println("Enter party:");
					String party = sc.next();
					System.out.println("Enter votes");
					int votes = sc.nextInt();
					c.setName(name);
					c.setParty(party);
					c.setVotes(votes);
					c.setId(id);
					int cnt = dao.updateCandidate(c);
					System.out.println("Candidate updated" + cnt);
				} catch (Exception e) {

					e.printStackTrace();
				}
				break;

			case 4:
				try (CandidateDao dao = new CandidateDao()) {
					List<Candidate> list = dao.displayAll();
					list.forEach(l -> System.out.println(l));
					// System.out.println(list);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 5:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter candidate id (to vote): ");
					int candidateId = sc.nextInt();
					int cnt = dao.incrementVote(candidateId);
					System.out.println("Rows updated: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 6:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter party: ");
					String party = sc.next();
					List<Candidate> list = dao.findByParty(party);
					list.forEach(b -> System.out.println(b));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}

				break;

			case 7:
				try (PartyVotesDao dao = new PartyVotesDao()) {
					List<PartyVotes> list = dao.getPartywiseVotes();
					list.forEach(p -> System.out.println(p));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			}

		} while (choice != 0);
	}
}
