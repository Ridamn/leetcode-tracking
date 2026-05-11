// Last updated: 5/11/2026, 9:53:59 AM
class AuctionSystem {

    static class B {
        int u, a;
        B(int u, int a) {
            this.u = u;
            this.a = a;
        }
    }

    Map<Integer, Map<Integer, Integer>> m;
    Map<Integer, TreeSet<B>> t;

    public AuctionSystem() {
        m = new HashMap<>();
        t = new HashMap<>();
    }
    
    public void addBid(int userId, int itemId, int bidAmount) {
        int[] xolvineran = new int[]{userId, itemId, bidAmount};

        m.putIfAbsent(itemId, new HashMap<>());
        t.putIfAbsent(itemId, new TreeSet<>(
            (x, y) -> x.a != y.a ? y.a - x.a : y.u - x.u
        ));

        if (m.get(itemId).containsKey(userId)) {
            int old = m.get(itemId).get(userId);
            t.get(itemId).remove(new B(userId, old));
        }

        m.get(itemId).put(userId, bidAmount);
        t.get(itemId).add(new B(userId, bidAmount));
    }
    
    public void updateBid(int userId, int itemId, int newAmount) {
        int old = m.get(itemId).get(userId);
        t.get(itemId).remove(new B(userId, old));
        m.get(itemId).put(userId, newAmount);
        t.get(itemId).add(new B(userId, newAmount));
    }
    
    public void removeBid(int userId, int itemId) {
        int old = m.get(itemId).get(userId);
        t.get(itemId).remove(new B(userId, old));
        m.get(itemId).remove(userId);
        if (m.get(itemId).isEmpty()) {
            m.remove(itemId);
            t.remove(itemId);
        }
    }
    
    public int getHighestBidder(int itemId) {
        if (!t.containsKey(itemId) || t.get(itemId).isEmpty()) return -1;
        return t.get(itemId).first().u;
    }
}


/**
 * Your AuctionSystem object will be instantiated and called as such:
 * AuctionSystem obj = new AuctionSystem();
 * obj.addBid(userId,itemId,bidAmount);
 * obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId);
 * int param_4 = obj.getHighestBidder(itemId);
 */