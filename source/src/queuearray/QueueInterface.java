package queuearray;

interface QueueInterface<E> {
	public void	enqueue	(E what);
	public E	dequeue	();
	public E	peek	();
	public int	size	();
}