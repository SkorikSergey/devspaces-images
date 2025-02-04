/*
 * Copyright (c) 2012-2023 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.factory.server.github;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import org.eclipse.che.api.factory.server.scm.GitUserDataFetcher;
import org.eclipse.che.api.factory.server.scm.PersonalAccessTokenFetcher;

public class GithubModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder<PersonalAccessTokenFetcher> tokenFetcherMultibinder =
        Multibinder.newSetBinder(binder(), PersonalAccessTokenFetcher.class);
    tokenFetcherMultibinder.addBinding().to(GithubPersonalAccessTokenFetcher.class);
    Multibinder<GitUserDataFetcher> gitUserDataMultibinder =
        Multibinder.newSetBinder(binder(), GitUserDataFetcher.class);
    gitUserDataMultibinder.addBinding().to(GithubUserDataFetcher.class);
  }
}
