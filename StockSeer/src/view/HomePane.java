package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

import controller.HomePaneController;
import controller.JoinController;

import javax.swing.JList;

public class HomePane extends JPanel {

	public static final String CREATE_LEAGUE = "Create a league";
	public static final String JOIN_LEAGUE = "Join";
	public static final String LOGOUT = "Logout";
	public static final String REFRESH = "Refresh";
	public static final String DETAIL = "Detail";
	private JList leagueList;
	private JButton btnCreate;
	private JButton btnLogout;
	private JButton btnJoin;
	private JButton btnRefresh;
	private JButton btnDetail;
	private Component horizontalGlue_3;

	/**
	 * Create the panel.
	 */
	public HomePane() {
		setLayout(new BorderLayout(0, 0));

		JPanel panelBottomControl = new JPanel();
		add(panelBottomControl, BorderLayout.SOUTH);
		panelBottomControl.setLayout(new BoxLayout(panelBottomControl, BoxLayout.X_AXIS));

		btnRefresh = new JButton(REFRESH);
		panelBottomControl.add(btnRefresh);

		Component horizontalGlue_1 = Box.createHorizontalGlue();
		panelBottomControl.add(horizontalGlue_1);

		btnDetail = new JButton(DETAIL);
		panelBottomControl.add(btnDetail);

		Component horizontalGlue = Box.createHorizontalGlue();
		panelBottomControl.add(horizontalGlue);

		btnJoin = new JButton(JOIN_LEAGUE);
		panelBottomControl.add(btnJoin);

		horizontalGlue_3 = Box.createHorizontalGlue();
		panelBottomControl.add(horizontalGlue_3);

		btnCreate = new JButton(CREATE_LEAGUE);
		panelBottomControl.add(btnCreate);

		JPanel panelTopControl = new JPanel();
		add(panelTopControl, BorderLayout.NORTH);
		panelTopControl.setLayout(new BoxLayout(panelTopControl, BoxLayout.X_AXIS));

		btnLogout = new JButton(LOGOUT);
		panelTopControl.add(btnLogout);

		Component horizontalGlue_2 = Box.createHorizontalGlue();
		panelTopControl.add(horizontalGlue_2);

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		leagueList = new JList();
		scrollPane.setViewportView(leagueList);

	}

	public void refresh() {
		
	}

	public void registerListeners(HomePaneController homePaneController) {
		btnCreate.addActionListener(homePaneController);
		btnLogout.addActionListener(homePaneController);
		btnJoin.addActionListener(homePaneController);
		btnRefresh.addActionListener(homePaneController);
		btnDetail.addActionListener(homePaneController);
	}

}