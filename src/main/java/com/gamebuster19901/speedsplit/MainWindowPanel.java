package com.gamebuster19901.speedsplit;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JSpinner;

public class MainWindowPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainWindowPanel() {
		final Dimension maxSize = new Dimension(250, 250);
		{
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
			gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0};
			gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gridBagLayout.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
			setLayout(gridBagLayout);
		}
		{
			JLabel lblInput = new JLabel("Input: ");
			lblInput.setVerticalAlignment(SwingConstants.BOTTOM);
			lblInput.setHorizontalAlignment(SwingConstants.CENTER);
			GridBagConstraints gbc_lblInput = new GridBagConstraints();
			gbc_lblInput.anchor = GridBagConstraints.SOUTH;
			gbc_lblInput.insets = new Insets(0, 0, 5, 5);
			gbc_lblInput.gridx = 1;
			gbc_lblInput.gridy = 0;
			add(lblInput, gbc_lblInput);
		}
		{
			JLabel lblExpectedSplit = new JLabel("Expected Split: ");
			lblExpectedSplit.setHorizontalAlignment(SwingConstants.CENTER);
			lblExpectedSplit.setVerticalAlignment(SwingConstants.BOTTOM);
			GridBagConstraints gbc_lblExpectedSplit = new GridBagConstraints();
			gbc_lblExpectedSplit.anchor = GridBagConstraints.SOUTH;
			gbc_lblExpectedSplit.insets = new Insets(0, 0, 5, 5);
			gbc_lblExpectedSplit.gridx = 3;
			gbc_lblExpectedSplit.gridy = 0;
			add(lblExpectedSplit, gbc_lblExpectedSplit);
		}
		{
			JPanel sidePanel = new JPanel();
			GridBagConstraints gbc_sidePanel = new GridBagConstraints();
			gbc_sidePanel.insets = new Insets(0, 0, 5, 5);
			gbc_sidePanel.fill = GridBagConstraints.BOTH;
			gbc_sidePanel.gridx = 0;
			gbc_sidePanel.gridy = 1;
			add(sidePanel, gbc_sidePanel);
			GridBagLayout gbl_sidePanel = new GridBagLayout();
			gbl_sidePanel.columnWidths = new int[] {0, 0};
			gbl_sidePanel.rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
			gbl_sidePanel.columnWeights = new double[]{1.0, 1.0};
			gbl_sidePanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			sidePanel.setLayout(gbl_sidePanel);
			{
				JButton selectRegionButton = new JButton("Select Region");
				selectRegionButton.setMargin(new Insets(0, 0, 0, 0));
				GridBagConstraints gbc_selectRegionButton = new GridBagConstraints();
				gbc_selectRegionButton.insets = new Insets(0, 0, 5, 0);
				gbc_selectRegionButton.gridwidth = 2;
				gbc_selectRegionButton.gridx = 0;
				gbc_selectRegionButton.gridy = 0;
				sidePanel.add(selectRegionButton, gbc_selectRegionButton);
			}
			{
				JLabel lblX = new JLabel("X");
				GridBagConstraints gbc_lblX = new GridBagConstraints();
				gbc_lblX.insets = new Insets(0, 0, 5, 5);
				gbc_lblX.gridx = 0;
				gbc_lblX.gridy = 1;
				sidePanel.add(lblX, gbc_lblX);
			}
			{
				JLabel lblY = new JLabel("Y");
				GridBagConstraints gbc_lblY = new GridBagConstraints();
				gbc_lblY.insets = new Insets(0, 0, 5, 0);
				gbc_lblY.gridx = 1;
				gbc_lblY.gridy = 1;
				sidePanel.add(lblY, gbc_lblY);
			}
			{
				JSpinner spinner = new JSpinner();
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
				gbc_spinner.insets = new Insets(0, 0, 5, 5);
				gbc_spinner.gridx = 0;
				gbc_spinner.gridy = 2;
				sidePanel.add(spinner, gbc_spinner);
			}
			{
				JSpinner spinner = new JSpinner();
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.insets = new Insets(0, 0, 5, 0);
				gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
				gbc_spinner.gridx = 1;
				gbc_spinner.gridy = 2;
				sidePanel.add(spinner, gbc_spinner);
			}
			{
				JLabel lblWidth = new JLabel("Width");
				GridBagConstraints gbc_lblWidth = new GridBagConstraints();
				gbc_lblWidth.insets = new Insets(0, 0, 5, 5);
				gbc_lblWidth.gridx = 0;
				gbc_lblWidth.gridy = 3;
				sidePanel.add(lblWidth, gbc_lblWidth);
			}
			{
				JLabel lblHeight = new JLabel("Height");
				GridBagConstraints gbc_lblHeight = new GridBagConstraints();
				gbc_lblHeight.insets = new Insets(0, 0, 5, 0);
				gbc_lblHeight.gridx = 1;
				gbc_lblHeight.gridy = 3;
				sidePanel.add(lblHeight, gbc_lblHeight);
			}
			{
				JSpinner spinner = new JSpinner();
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
				gbc_spinner.insets = new Insets(0, 0, 5, 5);
				gbc_spinner.gridx = 0;
				gbc_spinner.gridy = 4;
				sidePanel.add(spinner, gbc_spinner);
			}
			{
				JSpinner spinner = new JSpinner();
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
				gbc_spinner.insets = new Insets(0, 0, 5, 0);
				gbc_spinner.gridx = 1;
				gbc_spinner.gridy = 4;
				sidePanel.add(spinner, gbc_spinner);
			}
			{
				JLabel lblFpsLimit = new JLabel("FPS:");
				lblFpsLimit.setHorizontalAlignment(SwingConstants.RIGHT);
				GridBagConstraints gbc_lblFpsLimit = new GridBagConstraints();
				gbc_lblFpsLimit.fill = GridBagConstraints.HORIZONTAL;
				gbc_lblFpsLimit.insets = new Insets(0, 0, 0, 5);
				gbc_lblFpsLimit.gridx = 0;
				gbc_lblFpsLimit.gridy = 5;
				sidePanel.add(lblFpsLimit, gbc_lblFpsLimit);
			}
			{
				SpinnerNumberModel modal = new SpinnerNumberModel(60, 5, 60, 1);
				JSpinner spinner = new JSpinner(modal);
				spinner.setEnabled(true);
				GridBagConstraints gbc_spinner = new GridBagConstraints();
				gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
				gbc_spinner.gridx = 1;
				gbc_spinner.gridy = 5;
				sidePanel.add(spinner, gbc_spinner);
			}
		}
		{
			JTextPane inputPane = new JTextPane();
			inputPane.setPreferredSize(new Dimension(250, 250));
			inputPane.setMinimumSize(new Dimension(250, 250));
			inputPane.setMaximumSize(new Dimension(250, 250));
			GridBagConstraints gbc_inputPane = new GridBagConstraints();
			gbc_inputPane.anchor = GridBagConstraints.NORTH;
			gbc_inputPane.insets = new Insets(0, 0, 5, 5);
			gbc_inputPane.gridx = 1;
			gbc_inputPane.gridy = 1;
			add(inputPane, gbc_inputPane);
		}
		{
			JTextPane splitPane = new JTextPane();
			splitPane.setPreferredSize(maxSize);
			splitPane.setMinimumSize(maxSize);
			splitPane.setMaximumSize(maxSize);
			GridBagConstraints gbc_splitPane = new GridBagConstraints();
			gbc_splitPane.anchor = GridBagConstraints.NORTH;
			gbc_splitPane.insets = new Insets(0, 0, 5, 5);
			gbc_splitPane.gridx = 3;
			gbc_splitPane.gridy = 1;
			add(splitPane, gbc_splitPane);
		}
		{
			JPanel panel = new JPanel();
			GridBagConstraints gbc_panel = new GridBagConstraints();
			gbc_panel.insets = new Insets(0, 0, 5, 5);
			gbc_panel.gridx = 3;
			gbc_panel.gridy = 2;
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
				Label similarityPercentage = new Label("0%");
				GridBagConstraints gbc_similarityPercentage = new GridBagConstraints();
				gbc_similarityPercentage.anchor = GridBagConstraints.WEST;
				gbc_similarityPercentage.insets = new Insets(0, 0, 5, 0);
				gbc_similarityPercentage.fill = GridBagConstraints.BOTH;
				gbc_similarityPercentage.gridx = 1;
				gbc_similarityPercentage.gridy = 0;
				panel.add(similarityPercentage, gbc_similarityPercentage);
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
				Label thresholdPercentage = new Label("0%");
				GridBagConstraints gbc_thresholdPercentage = new GridBagConstraints();
				gbc_thresholdPercentage.insets = new Insets(0, 0, 5, 0);
				gbc_thresholdPercentage.anchor = GridBagConstraints.WEST;
				gbc_thresholdPercentage.gridx = 1;
				gbc_thresholdPercentage.gridy = 1;
				panel.add(thresholdPercentage, gbc_thresholdPercentage);
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
				Label labelActionToDo = new Label("Press \\");
				GridBagConstraints gbc_labelActionToDo = new GridBagConstraints();
				gbc_labelActionToDo.anchor = GridBagConstraints.WEST;
				gbc_labelActionToDo.gridx = 1;
				gbc_labelActionToDo.gridy = 2;
				panel.add(labelActionToDo, gbc_labelActionToDo);
			}
		}
	}
}
