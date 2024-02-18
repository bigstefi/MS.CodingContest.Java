public interface IFenceBuilderParticipant
{
    string GetFantasyName();
    double Encircle(Point[] trees);
    double Encircle(int[] treesRowColumns);
    int[] ShowSolution();
}
