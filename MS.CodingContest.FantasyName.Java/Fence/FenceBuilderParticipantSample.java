public class FenceBuilderParticipantSample implements IFenceBuilderParticipant
{
    private string _fantasyName = "JavaSample";
    private double _fenceLength = 4; // dummy initial value
    private Point[] _trees = null;

    @Override
    public string GetFantasyName()
    {
        return _fantasyName;
    }

    @Override
    public double Encircle(Point[] trees)
    {
        _trees = trees;

        // ToDo: add your implementation here...

        return _fenceLength;
    }

    @Override
    public int[] ShowSolution()
    {
        Array<Integer> indexesOuterTrees = new Array<Integer>();

        // this is a dummy implementation
        for(int i=0; i<_trees.length; ++i)
        {
            indexesOuterTrees.add(i);
        }

        return indexesOuterTrees.toArray();
    }
}
