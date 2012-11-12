package servermanager;

interface QueueInterface<E> extends Iterable<E> {
	public void	enqueue	(E what);
	public E	dequeue	();
	public E	peek	();
	public int	size	();
}