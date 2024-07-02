/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.itsaky.androidide.lsp.java.indexing.internal

import com.google.auto.service.AutoService
import com.itsaky.androidide.indexing.IIndexService
import com.itsaky.androidide.projects.IWorkspace
import java.io.File

/**
 * @author Akash Yadav
 */
@AutoService(IIndexService::class)
internal class JavaIndexServiceImpl : IIndexService {

  override val displayName: String
    get() = "Java LSP Indexing Service"

  override fun scanFiles(workspace: IWorkspace): Collection<File> {
    return emptySet()
  }

  override suspend fun indexFiles(
    workspace: IWorkspace,
    files: Collection<File>
  ) {
  }
}