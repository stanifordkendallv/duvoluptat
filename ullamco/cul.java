public class AnimationState {
    private Map<String, Object> animationStateMap;

    public Object getAnimationState(String key) {
        return animationStateMap.get(key);
    }

    public void setAnimationState(String key, Object value) {
        animationStateMap.put(key, value);
    }
}
