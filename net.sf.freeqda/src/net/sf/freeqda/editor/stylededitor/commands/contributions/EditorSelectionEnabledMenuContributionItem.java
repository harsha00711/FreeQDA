/*******************************************************************************
 * FreeQDA,  a software for professional qualitative research data 
 * analysis, such as interviews, manuscripts, journal articles, memos
 * and field notes.
 *
 * Copyright (C) 2011 Dirk Kitscha, Jörg große Schlarmann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package net.sf.freeqda.editor.stylededitor.commands.contributions;

import net.sf.freeqda.common.widget.ITaggableStyledTextProvider;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;


public class EditorSelectionEnabledMenuContributionItem extends CommandContributionItem {

	public EditorSelectionEnabledMenuContributionItem(
			CommandContributionItemParameter contributionParameters) {
		super(contributionParameters);
	}

	@Override
	public boolean isEnabled() {
		/*
		 * Get the view
		 */
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		
		IEditorPart editorPart = page.getActiveEditor();

		if (editorPart instanceof ITaggableStyledTextProvider) {
			ITaggableStyledTextProvider provider = (ITaggableStyledTextProvider) page.getActiveEditor();
			if ((provider != null) && (provider.getActiveStyledText() != null)) {
				return provider.getActiveStyledText().getSelectionCount() > 0;
			}
		}
		return false;
	}

}
