public class Context {
	private Weather weather;
	public void setWeather(Weather weather)
	{
		this.weather=weather;
	}
	public Weather getWeather()
	{
		return  this.weather;
	}
	public String weatherMessager()
	{
		return weather.getWeather();
	}
}