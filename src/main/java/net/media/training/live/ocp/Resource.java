package net.media.training.live.ocp;

/**
 * Created by autoopt/mayank.k
 */

public abstract class Resource {
    protected abstract int findFreeSlot();
    protected abstract void markSlotBusy(int resourceId);
    protected abstract void markSlotFree(int resourceId);

    public int allocate() {
        int resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId){
        markSlotFree(resourceId);
    }
}
