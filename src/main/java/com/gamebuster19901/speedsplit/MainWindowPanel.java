package com.gamebuster19901.speedsplit;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Label;

public class MainWindowPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainWindowPanel() {
		final Dimension maxSize = new Dimension(500, 500);
		{
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
			gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
			gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			setLayout(gridBagLayout);
		}
		{
			JTextPane inputPane = new JTextPane();
			inputPane.setPreferredSize(new Dimension(500, 500));
			inputPane.setMinimumSize(new Dimension(500, 500));
			inputPane.setMaximumSize(new Dimension(500, 500));
			GridBagConstraints gbc_inputPane = new GridBagConstraints();
			gbc_inputPane.insets = new Insets(0, 0, 5, 5);
			gbc_inputPane.fill = GridBagConstraints.BOTH;
			gbc_inputPane.gridx = 1;
			gbc_inputPane.gridy = 1;
			add(inputPane, gbc_inputPane);
		}
		{
			JLabel lblNewLabel = new JLabel("New label");
			lblNewLabel.setMaximumSize(new Dimension(500, 500));
			GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
			gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
			gbc_lblNewLabel.gridx = 2;
			gbc_lblNewLabel.gridy = 1;
			add(lblNewLabel, gbc_lblNewLabel);
		}
		{
			JTextPane splitPane = new JTextPane();
			splitPane.setPreferredSize(maxSize);
			splitPane.setMinimumSize(maxSize);
			splitPane.setMaximumSize(maxSize);
			GridBagConstraints gbc_splitPane = new GridBagConstraints();
			gbc_splitPane.insets = new Insets(0, 0, 5, 5);
			gbc_splitPane.fill = GridBagConstraints.BOTH;
			gbc_splitPane.gridx = 3;
			gbc_splitPane.gridy = 1;
			add(splitPane, gbc_splitPane);
		}
		{
			JLabel lblInput = new JLabel("Input: ");
			lblInput.setVerticalAlignment(SwingConstants.TOP);
			lblInput.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblInput = new GridBagConstraints();
			gbc_lblInput.insets = new Insets(0, 0, 5, 5);
			gbc_lblInput.gridx = 1;
			gbc_lblInput.gridy = 2;
			add(lblInput, gbc_lblInput);
		}
		{
			JLabel lblExpectedSplit = new JLabel("Expected Split: ");
			lblExpectedSplit.setHorizontalAlignment(SwingConstants.CENTER);
			lblExpectedSplit.setVerticalAlignment(SwingConstants.TOP);
			GridBagConstraints gbc_lblExpectedSplit = new GridBagConstraints();
			gbc_lblExpectedSplit.insets = new Insets(0, 0, 5, 5);
			gbc_lblExpectedSplit.gridx = 3;
			gbc_lblExpectedSplit.gridy = 2;
			add(lblExpectedSplit, gbc_lblExpectedSplit);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 0, 5);
			gbc_panel.gridx = 3;
			gbc_panel.gridy = 3;
			add(panel, gbc_panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{75, 75, 0};
			gbl_panel.rowHeights = new int[]{21, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblSimilarity = new JLabel("Similarity: ");
				lblSimilarity.setToolTipText("How similar the input is to the expected split");
				lblSimilarity.setHorizontalAlignment(SwingConstants.RIGHT);
				GridBagConstraints gbc_lblSimilarity = new GridBagConstraints();
				gbc_lblSimilarity.anchor = GridBagConstraints.EAST;
				gbc_lblSimilarity.fill = GridBagConstraints.BOTH;
				gbc_lblSimilarity.insets = new Insets(0, 0, 5, 5);
				gbc_lblSimilarity.gridx = 0;
				gbc_lblSimilarity.gridy = 0;
				panel.add(lblSimilarity, gbc_lblSimilarity);
			}
			{
				Label label = new Label("0%");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.anchor = GridBagConstraints.WEST;
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.fill = GridBagConstraints.BOTH;
				gbc_label.gridx = 1;
				gbc_label.gridy = 0;
				panel.add(label, gbc_label);
			}
			{
				JLabel lblThreshold = new JLabel("Threshold: ");
				lblThreshold.setToolTipText("The similarity required to perform the action");
				lblThreshold.setHorizontalAlignment(SwingConstants.RIGHT);
				GridBagConstraints gbc_lblThreshold = new GridBagConstraints();
				gbc_lblThreshold.anchor = GridBagConstraints.EAST;
				gbc_lblThreshold.insets = new Insets(0, 0, 5, 5);
				gbc_lblThreshold.gridx = 0;
				gbc_lblThreshold.gridy = 1;
				panel.add(lblThreshold, gbc_lblThreshold);
			}
			{
				Label label = new Label("0%");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.anchor = GridBagConstraints.WEST;
				gbc_label.gridx = 1;
				gbc_label.gridy = 1;
				panel.add(label, gbc_label);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Action: ");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNewLabel_1.setToolTipText("The action to perform if the similarity crosses the threshold");
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel_1.gridx = 0;
				gbc_lblNewLabel_1.gridy = 2;
				panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
			}
			{
				Label label = new Label("Press \\");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.anchor = GridBagConstraints.WEST;
				gbc_label.gridx = 1;
				gbc_label.gridy = 2;
				panel.add(label, gbc_label);
			}
		}
	}
}
