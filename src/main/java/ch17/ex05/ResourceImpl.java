package ch17.ex05;

public class ResourceImpl implements Resource {
    int keyHash;
    boolean needsRelease = false;

    ResourceImpl(Object key) {
        keyHash = System.identityHashCode(key);
        // Set resource
        needsRelease = true;
    }

    @Override
    public void use(Object key, Object... args) {
        if (System.identityHashCode(key) != keyHash)
            throw new IllegalArgumentException("wrong key");
        // Use resource
    }

    @Override
    public synchronized void release() {
        if (needsRelease) {
            needsRelease = false;
            // Release resource
        }
    }
}
