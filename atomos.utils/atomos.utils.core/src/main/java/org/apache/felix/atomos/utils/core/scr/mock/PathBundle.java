/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.felix.atomos.utils.core.scr.mock;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.jar.JarFile;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.Version;

public class PathBundle implements Bundle
{
    public PathBundle(JarFile jar)
    {
    }

    @Override
    public <A> A adapt(Class<A> type)
    {
        return null;
    }

    @Override
    public int compareTo(Bundle o)
    {
        return 0;
    }

    @Override
    public Enumeration<URL> findEntries(String path, String filePattern, boolean recurse)
    {
        return null;
    }

    @Override
    public BundleContext getBundleContext()
    {
        return null;
    }

    @Override
    public long getBundleId()
    {
        return 0;
    }

    @Override
    public File getDataFile(String filename)
    {
        return null;
    }

    @Override
    public URL getEntry(String path)
    {
        return null;
    }

    @Override
    public Enumeration<String> getEntryPaths(String path)
    {
        return null;
    }

    @Override
    public Dictionary<String, String> getHeaders()
    {
        return new Hashtable<>();
    }

    @Override
    public Dictionary<String, String> getHeaders(String locale)
    {
        return new Hashtable<>();
    }

    @Override
    public long getLastModified()
    {
        return 0;
    }

    @Override
    public String getLocation()
    {
        return null;
    }

    @Override
    public ServiceReference<?>[] getRegisteredServices()
    {
        return null;
    }

    @Override
    public URL getResource(String name)
    {
        return null;
    }

    @Override
    public Enumeration<URL> getResources(String name) throws IOException
    {
        return null;
    }

    @Override
    public ServiceReference<?>[] getServicesInUse()
    {
        return null;
    }

    @Override
    public Map<X509Certificate, List<X509Certificate>> getSignerCertificates(
        int signersType)
    {
        return null;
    }

    @Override
    public int getState()
    {
        return 0;
    }

    @Override
    public String getSymbolicName()
    {
        return null;
    }

    @Override
    public Version getVersion()
    {
        return null;
    }

    @Override
    public boolean hasPermission(Object permission)
    {
        return false;
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException
    {
        return null;
    }

    @Override
    public void start() throws BundleException
    {
    }

    @Override
    public void start(int options) throws BundleException
    {
    }

    @Override
    public void stop() throws BundleException
    {
    }

    @Override
    public void stop(int options) throws BundleException
    {
    }

    @Override
    public void uninstall() throws BundleException
    {
    }

    @Override
    public void update() throws BundleException
    {
    }

    @Override
    public void update(InputStream input) throws BundleException
    {
    }
}
