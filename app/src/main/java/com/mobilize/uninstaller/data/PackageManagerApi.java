/*
 * Copyright (c) 2015 Project contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package com.mobilize.uninstaller.data;

import java.util.List;

public interface PackageManagerApi {
    interface Callback<T> {
        void onSuccess(T result);

        void onError(Exception e);
    }

    interface OnPackagesChangedListener {
        void onPackagesChanged(List<Package> newPackages);
    }

    void getUserRemovablePackages(Callback<List<Package>> callback);

    void uninstallPackages(final List<Package> packages);

    void setOnPackagesChangedListener(final OnPackagesChangedListener listener);
}
