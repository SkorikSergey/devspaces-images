/**********************************************************************
 * Copyright (c) 2023 Red Hat, Inc.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 ***********************************************************************/

import { Main } from "./main";

(async (): Promise<void> => {
  const main = new Main();

  try {
    await main.start();
  } catch (err) {
    console.error(err.message);
    process.exit(1);
  }
})();
